package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_87 {
    private final Production89_87 production = new Production89_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}