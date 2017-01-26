package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_39 {
    private final Production24_39 production = new Production24_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}