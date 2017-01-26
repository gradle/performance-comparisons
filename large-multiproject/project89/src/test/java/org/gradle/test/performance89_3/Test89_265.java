package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_265 {
    private final Production89_265 production = new Production89_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}