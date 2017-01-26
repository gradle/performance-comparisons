package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_33 {
    private final Production24_33 production = new Production24_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}