package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_18 {
    private final Production24_18 production = new Production24_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}