package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_27 {
    private final Production98_27 production = new Production98_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}