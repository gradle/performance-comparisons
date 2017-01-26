package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20353 {
    private final Productionnull_20353 production = new Productionnull_20353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}