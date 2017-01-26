package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_310 {
    private final Production89_310 production = new Production89_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}