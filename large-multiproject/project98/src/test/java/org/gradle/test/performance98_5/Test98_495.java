package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_495 {
    private final Production98_495 production = new Production98_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}