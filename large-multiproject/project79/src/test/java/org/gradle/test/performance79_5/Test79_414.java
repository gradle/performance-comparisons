package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_414 {
    private final Production79_414 production = new Production79_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}