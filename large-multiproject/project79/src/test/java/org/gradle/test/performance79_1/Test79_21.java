package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_21 {
    private final Production79_21 production = new Production79_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}