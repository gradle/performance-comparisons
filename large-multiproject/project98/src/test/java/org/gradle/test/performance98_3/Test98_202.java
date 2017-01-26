package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_202 {
    private final Production98_202 production = new Production98_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}