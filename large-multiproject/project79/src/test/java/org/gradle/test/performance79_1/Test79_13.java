package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_13 {
    private final Production79_13 production = new Production79_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}