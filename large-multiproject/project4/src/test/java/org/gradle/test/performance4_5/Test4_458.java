package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_458 {
    private final Production4_458 production = new Production4_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}