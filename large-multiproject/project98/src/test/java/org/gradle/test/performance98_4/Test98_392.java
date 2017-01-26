package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_392 {
    private final Production98_392 production = new Production98_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}