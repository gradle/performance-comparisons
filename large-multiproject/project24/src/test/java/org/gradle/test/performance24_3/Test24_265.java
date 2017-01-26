package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_265 {
    private final Production24_265 production = new Production24_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}