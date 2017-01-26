package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_95 {
    private final Production24_95 production = new Production24_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}