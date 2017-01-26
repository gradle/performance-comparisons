package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_59 {
    private final Production89_59 production = new Production89_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}