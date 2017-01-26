package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_197 {
    private final Production24_197 production = new Production24_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}