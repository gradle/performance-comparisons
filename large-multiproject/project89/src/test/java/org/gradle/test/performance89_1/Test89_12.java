package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_12 {
    private final Production89_12 production = new Production89_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}