package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_75 {
    private final Production98_75 production = new Production98_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}