package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_106 {
    private final Production89_106 production = new Production89_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}