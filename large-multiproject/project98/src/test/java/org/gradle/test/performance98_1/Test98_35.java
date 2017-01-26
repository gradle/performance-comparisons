package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_35 {
    private final Production98_35 production = new Production98_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}