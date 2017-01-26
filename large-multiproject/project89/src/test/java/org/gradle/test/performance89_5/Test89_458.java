package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_458 {
    private final Production89_458 production = new Production89_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}