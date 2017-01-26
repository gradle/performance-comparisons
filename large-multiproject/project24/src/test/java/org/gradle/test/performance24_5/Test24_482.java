package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_482 {
    private final Production24_482 production = new Production24_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}