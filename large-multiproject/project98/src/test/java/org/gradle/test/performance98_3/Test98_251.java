package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_251 {
    private final Production98_251 production = new Production98_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}