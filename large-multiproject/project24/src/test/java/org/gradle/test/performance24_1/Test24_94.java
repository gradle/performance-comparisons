package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_94 {
    private final Production24_94 production = new Production24_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}