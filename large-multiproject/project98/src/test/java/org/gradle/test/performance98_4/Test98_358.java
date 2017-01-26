package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_358 {
    private final Production98_358 production = new Production98_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}