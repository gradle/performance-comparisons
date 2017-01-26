package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_482 {
    private final Production4_482 production = new Production4_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}