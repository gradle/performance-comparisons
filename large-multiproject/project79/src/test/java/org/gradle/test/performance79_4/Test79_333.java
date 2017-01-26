package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_333 {
    private final Production79_333 production = new Production79_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}