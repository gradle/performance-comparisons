package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_268 {
    private final Production98_268 production = new Production98_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}