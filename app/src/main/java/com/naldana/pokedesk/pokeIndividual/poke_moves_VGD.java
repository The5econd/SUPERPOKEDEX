package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_moves_VGD {
    public poke_moves_VGD() {
    }
    private int level_learned_at;
    public class move_learn_method{
        public move_learn_method() {
        }
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
    public class version_group{
        public version_group() {
        }
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
    private move_learn_method move_learn_method;
    private version_group version_group;

    public poke_moves_VGD.move_learn_method getMove_learn_method() {
        return move_learn_method;
    }

    public void setMove_learn_method(poke_moves_VGD.move_learn_method move_learn_method) {
        this.move_learn_method = move_learn_method;
    }

    public poke_moves_VGD.version_group getVersion_group() {
        return version_group;
    }

    public void setVersion_group(poke_moves_VGD.version_group version_group) {
        this.version_group = version_group;
    }

    public int getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(int level_learned_at) {
        this.level_learned_at = level_learned_at;
    }
}
