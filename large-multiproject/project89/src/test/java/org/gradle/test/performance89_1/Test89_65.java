package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_65 {
    private final Production89_65 production = new Production89_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}