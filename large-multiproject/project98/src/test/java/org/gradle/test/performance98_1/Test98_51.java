package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_51 {
    private final Production98_51 production = new Production98_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}