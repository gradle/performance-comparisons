package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_200 {
    private final Production98_200 production = new Production98_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}