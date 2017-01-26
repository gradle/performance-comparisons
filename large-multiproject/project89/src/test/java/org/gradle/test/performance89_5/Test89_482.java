package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_482 {
    private final Production89_482 production = new Production89_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}