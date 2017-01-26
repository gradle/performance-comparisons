package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_390 {
    private final Production98_390 production = new Production98_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}