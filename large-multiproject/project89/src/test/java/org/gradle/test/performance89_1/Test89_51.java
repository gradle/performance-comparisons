package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_51 {
    private final Production89_51 production = new Production89_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}