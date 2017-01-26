package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_23 {
    private final Production24_23 production = new Production24_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}