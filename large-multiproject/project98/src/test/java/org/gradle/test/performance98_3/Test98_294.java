package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_294 {
    private final Production98_294 production = new Production98_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}