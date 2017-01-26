package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_59 {
    private final Production4_59 production = new Production4_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}