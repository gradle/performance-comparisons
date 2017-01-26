package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_30 {
    private final Production89_30 production = new Production89_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}