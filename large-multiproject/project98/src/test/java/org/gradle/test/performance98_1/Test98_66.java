package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_66 {
    private final Production98_66 production = new Production98_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}