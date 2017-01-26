package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_96 {
    private final Production98_96 production = new Production98_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}