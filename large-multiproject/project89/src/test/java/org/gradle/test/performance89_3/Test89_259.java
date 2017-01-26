package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_259 {
    private final Production89_259 production = new Production89_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}