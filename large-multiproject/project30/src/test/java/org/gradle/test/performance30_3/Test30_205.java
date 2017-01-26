package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_205 {
    private final Production30_205 production = new Production30_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}