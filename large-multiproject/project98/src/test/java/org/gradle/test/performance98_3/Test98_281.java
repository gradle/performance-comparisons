package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_281 {
    private final Production98_281 production = new Production98_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}