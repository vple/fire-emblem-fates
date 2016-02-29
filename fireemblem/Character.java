package fireemblem;

public class Character {
    final CharacterName name;
    final Gender gender;

    private Character(
        CharacterName name,
        Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // TODO: fully implement
    public boolean canMarry(Character otherCharacter) {
        if (this.gender == otherCharacter.gender) {
            return false;
        }

        return true;
    }

    public String toString() {
        return name.toString();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private CharacterName name;
        private Gender gender;

        public Builder setName(CharacterName name) {
            this.name = name;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Character build() {
            return new Character(name, gender);
        }
    }
}