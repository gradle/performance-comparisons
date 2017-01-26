package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_125 {
    private final Production79_125 production = new Production79_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}