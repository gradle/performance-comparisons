package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_20 {
    private final Production79_20 production = new Production79_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}