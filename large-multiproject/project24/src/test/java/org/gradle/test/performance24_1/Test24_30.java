package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_30 {
    private final Production24_30 production = new Production24_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}