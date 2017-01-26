package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_36 {
    private final Production98_36 production = new Production98_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}