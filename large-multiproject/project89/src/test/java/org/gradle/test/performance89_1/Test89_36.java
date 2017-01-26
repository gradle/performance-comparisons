package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_36 {
    private final Production89_36 production = new Production89_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}