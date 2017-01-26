package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_8 {
    private final Production98_8 production = new Production98_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}