package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_388 {
    private final Production98_388 production = new Production98_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}