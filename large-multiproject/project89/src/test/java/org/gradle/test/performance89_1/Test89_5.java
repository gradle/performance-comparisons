package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_5 {
    private final Production89_5 production = new Production89_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}