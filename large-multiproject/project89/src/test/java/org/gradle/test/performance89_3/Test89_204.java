package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_204 {
    private final Production89_204 production = new Production89_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}