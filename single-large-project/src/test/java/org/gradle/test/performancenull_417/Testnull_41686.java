package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41686 {
    private final Productionnull_41686 production = new Productionnull_41686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}