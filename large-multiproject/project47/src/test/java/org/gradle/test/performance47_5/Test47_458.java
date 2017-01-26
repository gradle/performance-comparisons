package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_458 {
    private final Production47_458 production = new Production47_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}