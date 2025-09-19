# Day17_Spring
One to One-Bidirectional Mapping-Spring JPA/Hibernate

A One-to-One Bidirectional Mapping in JPA/Hibernate represents a relationship where two entities are linked in such a way that each entity is aware of the other. Both sides maintain references, but only one is designated as the owning side, which defines the foreign key through the `@JoinColumn`. The other side is marked as the inverse, using the `mappedBy` attribute to indicate its relationship field. This mapping allows navigation from either entity, providing more flexibility when accessing related data, while still ensuring a single foreign key maintains the database integrity.

