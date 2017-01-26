package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_61 {
    private final Production98_61 production = new Production98_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}