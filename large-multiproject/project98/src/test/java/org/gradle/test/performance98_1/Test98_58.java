package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_58 {
    private final Production98_58 production = new Production98_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}