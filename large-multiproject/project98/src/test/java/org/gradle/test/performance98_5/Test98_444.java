package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_444 {
    private final Production98_444 production = new Production98_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}