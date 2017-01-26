package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_220 {
    private final Production89_220 production = new Production89_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}