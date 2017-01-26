package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_462 {
    private final Production24_462 production = new Production24_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}