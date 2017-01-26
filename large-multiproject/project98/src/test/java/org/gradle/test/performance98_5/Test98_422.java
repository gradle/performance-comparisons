package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_422 {
    private final Production98_422 production = new Production98_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}