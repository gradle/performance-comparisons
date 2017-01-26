package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_492 {
    private final Production24_492 production = new Production24_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}