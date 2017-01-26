package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_465 {
    private final Production98_465 production = new Production98_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}