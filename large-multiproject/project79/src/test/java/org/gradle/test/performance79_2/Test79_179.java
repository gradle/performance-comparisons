package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_179 {
    private final Production79_179 production = new Production79_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}