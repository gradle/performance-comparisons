package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_84 {
    private final Production24_84 production = new Production24_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}