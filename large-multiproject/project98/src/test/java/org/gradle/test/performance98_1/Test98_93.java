package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_93 {
    private final Production98_93 production = new Production98_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}