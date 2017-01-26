package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_129 {
    private final Production79_129 production = new Production79_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}