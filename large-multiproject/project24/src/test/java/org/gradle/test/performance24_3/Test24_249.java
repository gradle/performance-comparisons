package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_249 {
    private final Production24_249 production = new Production24_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}