package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_389 {
    private final Production79_389 production = new Production79_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}