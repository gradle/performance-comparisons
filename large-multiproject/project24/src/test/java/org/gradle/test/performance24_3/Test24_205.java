package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_205 {
    private final Production24_205 production = new Production24_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}