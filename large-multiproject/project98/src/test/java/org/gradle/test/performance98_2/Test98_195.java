package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_195 {
    private final Production98_195 production = new Production98_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}