package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_78 {
    private final Production98_78 production = new Production98_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}