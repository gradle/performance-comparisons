package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_74 {
    private final Production98_74 production = new Production98_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}