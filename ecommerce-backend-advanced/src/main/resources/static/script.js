const API = "http://localhost:8080/products"

// Load all products
async function loadProducts(){

    const res = await fetch(API)
    const data = await res.json()

    const div = document.getElementById("products")

    div.innerHTML = ""

    data.forEach(p => {

        div.innerHTML += `
<div class="product">

<h3>${p.name}</h3>

<p>${p.description}</p>

<p>💰 Price: ${p.price}</p>

<p>📦 Quantity: ${p.quantity}</p>

<button onclick="deleteProduct(${p.id})">
Delete
</button>

</div>
`

    })

}


// Add new product
async function addProduct(){

    const name = document.getElementById("name").value
    const description = document.getElementById("description").value
    const price = document.getElementById("price").value
    const quantity = document.getElementById("quantity").value

    await fetch(API,{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify({
            name:name,
            description:description,
            price:price,
            quantity:quantity
        })

    })

    loadProducts()

}


// Delete product
async function deleteProduct(id){

    await fetch(API + "/" + id,{
        method:"DELETE"
    })

    loadProducts()

}


// Load products when page starts
loadProducts()