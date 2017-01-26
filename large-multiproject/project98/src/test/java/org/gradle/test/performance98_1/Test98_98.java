package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_98 {
    private final Production98_98 production = new Production98_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}