package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_33 {
    private final Production89_33 production = new Production89_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}