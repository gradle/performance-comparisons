package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_134 {
    private final Production98_134 production = new Production98_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}