package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_10 {
    private final Production98_10 production = new Production98_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}