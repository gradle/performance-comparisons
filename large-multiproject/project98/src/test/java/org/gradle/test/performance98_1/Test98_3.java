package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_3 {
    private final Production98_3 production = new Production98_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}