package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_129 {
    private final Production24_129 production = new Production24_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}