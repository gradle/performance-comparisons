package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_297 {
    private final Production98_297 production = new Production98_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}