package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_280 {
    private final Production79_280 production = new Production79_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}