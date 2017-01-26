package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_39 {
    private final Production98_39 production = new Production98_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}