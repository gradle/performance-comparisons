package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_204 {
    private final Production93_204 production = new Production93_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}