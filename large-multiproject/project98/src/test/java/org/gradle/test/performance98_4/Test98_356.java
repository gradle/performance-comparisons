package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_356 {
    private final Production98_356 production = new Production98_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}