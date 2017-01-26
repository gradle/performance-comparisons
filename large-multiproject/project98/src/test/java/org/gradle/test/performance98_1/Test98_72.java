package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_72 {
    private final Production98_72 production = new Production98_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}