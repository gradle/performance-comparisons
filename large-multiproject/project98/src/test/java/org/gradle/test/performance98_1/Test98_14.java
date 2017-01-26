package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_14 {
    private final Production98_14 production = new Production98_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}