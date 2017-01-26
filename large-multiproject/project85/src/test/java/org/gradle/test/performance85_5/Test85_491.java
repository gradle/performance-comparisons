package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_491 {
    private final Production85_491 production = new Production85_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}