package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_152 {
    private final Production24_152 production = new Production24_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}