package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_132 {
    private final Production79_132 production = new Production79_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}