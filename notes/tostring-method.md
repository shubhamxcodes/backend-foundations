
---

### `tostring-method.md`

```md
# toString() in Java

## Purpose
- Make objects human-readable
- Useful for debugging and logs

## Example

```java
@Override
public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
}
