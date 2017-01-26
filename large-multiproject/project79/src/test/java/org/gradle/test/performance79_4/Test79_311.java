package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_311 {
    private final Production79_311 production = new Production79_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}