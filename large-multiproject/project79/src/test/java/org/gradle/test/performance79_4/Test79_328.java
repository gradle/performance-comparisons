package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_328 {
    private final Production79_328 production = new Production79_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}