package fireemblem;

public class Character {
    final CharacterName name;
    final Gender gender;
    final Stats maxStatModifiers;

    private Character(
        CharacterName name,
        Gender gender,
        Stats maxStatModifiers) {
        this.name = name;
        this.gender = gender;
        this.maxStatModifiers = maxStatModifiers;
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
        private Stats maxStatModifiers;

        public Builder setName(CharacterName name) {
            this.name = name;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setMaxStatModifiers(Stats maxStatModifiers) {
            this.maxStatModifiers = maxStatModifiers;
            return this;
        }

        public Character build() {
            return new Character(name, gender, maxStatModifiers);
        }
    }
}