package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_19 {
    private final Production24_19 production = new Production24_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}