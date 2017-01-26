package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_100 {
    private final Production98_100 production = new Production98_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}