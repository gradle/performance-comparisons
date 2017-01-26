package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_70 {
    private final Production24_70 production = new Production24_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}