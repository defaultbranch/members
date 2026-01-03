# Spring Backend Discussion — Summary

**Question**
- Preference: Spring Boot backend on JVM, minimal frontend without a framework, relying on solid backend APIs.
- Ask: brief thoughts, concerns, and suggestions.

**Response**
- **Thoughts:** Spring Boot fits well; strong ecosystem, robust security, easy PostgreSQL integration, and production-ready tooling. Minimal frontend is viable for admin-like CRUD and form workflows via Thymeleaf or static pages calling JSON APIs.
- **Concerns:** TOTP UX (enrollment, verification, backup codes, recovery), CSRF for forms and CORS for APIs, potential complexity creep as interactivity grows (attendance marking, filtering), and data privacy (strict role-based access, audit logging, retention/GDPR).
- **Suggestions:**
	- Backend: Spring Boot (Kotlin or Java), Spring Security, Spring Data JPA, PostgreSQL, Flyway/Liquibase, springdoc-openapi, Bean Validation.
	- TOTP: `org.jboss.aerogear:otp-java` or `com.warrenstrange:googleauth` for RFC 6238; integrate with Spring Security.
	- Frontend: start with Thymeleaf + Tailwind CSS; add micro‑interactions via HTMX or Alpine.js to avoid a full SPA.
	- API design: define core resources (members, guests, events, attendance, payments), roles (admin, member), and error/validation conventions.
	- Ops: containerize with Docker, add basic CI, configure rate limiting, and structured logging.
