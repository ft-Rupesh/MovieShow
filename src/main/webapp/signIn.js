/**
 * 
 */
function loadSignIn() {
    // Fetch the SignIn.html content
    fetch('SignIn.html')
        .then(response => {
            if (!response.ok) {
                throw new Error('Failed to load content');
            }
            return response.text();
        })
        .then(data => {
            // Inject the content into the dynamicContent div
            const dynamicContent = document.getElementById('dynamicContent');
            dynamicContent.innerHTML = data;

            // Make the content visible
            dynamicContent.classList.add('active');
        })
        .catch(error => {
            console.error('Error:', error);
        });
}
