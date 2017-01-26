package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_12 {
    private final Production24_12 production = new Production24_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}