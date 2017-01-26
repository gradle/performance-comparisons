package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_60 {
    private final Production24_60 production = new Production24_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}