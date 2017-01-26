package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_2 {
    private final Production98_2 production = new Production98_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}