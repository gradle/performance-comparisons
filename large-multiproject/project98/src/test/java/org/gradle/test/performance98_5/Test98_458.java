package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_458 {
    private final Production98_458 production = new Production98_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}