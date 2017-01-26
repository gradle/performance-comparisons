package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_437 {
    private final Production98_437 production = new Production98_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}