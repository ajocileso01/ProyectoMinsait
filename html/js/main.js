document.addEventListener('DOMContentLoaded', function() {
    const filtroForm = document.querySelector('.filtros form');
    if (filtroForm) {
        filtroForm.addEventListener('submit', function(e) {
            e.preventDefault();
            console.log('Filtrando eventos...');
        });
    }


    const btnInscribirse = document.querySelector('.btn-inscribirse');
    if (btnInscribirse) {
        btnInscribirse.addEventListener('click', function() {

            const usuarioLogueado = false; 
            
            if (usuarioLogueado) {
                alert('¡Te has inscrito correctamente al evento!');
                this.textContent = 'Inscrito';
                this.classList.add('btn-secondary');
                this.disabled = true;
            } else {
                alert('Por favor, inicia sesión o regístrate para inscribirte en el evento.');
            }
        });
    }

    const eventoCards = document.querySelectorAll('.evento-card, .categoria, .ponente-card');
    eventoCards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-5px)';
            this.style.boxShadow = '0 5px 15px rgba(0,0,0,0.1)';
        });
        
        card.addEventListener('mouseleave', function() {
            this.style.transform = '';
            this.style.boxShadow = '';
        });
    });
});