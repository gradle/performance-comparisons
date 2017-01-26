package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_246 {
    private final Production98_246 production = new Production98_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}