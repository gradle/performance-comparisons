package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_467 {
    private final Production79_467 production = new Production79_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}