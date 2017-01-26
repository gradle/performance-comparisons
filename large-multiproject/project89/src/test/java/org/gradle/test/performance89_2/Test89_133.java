package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_133 {
    private final Production89_133 production = new Production89_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}