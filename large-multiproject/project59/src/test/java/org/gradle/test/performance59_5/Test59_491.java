package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_491 {
    private final Production59_491 production = new Production59_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}