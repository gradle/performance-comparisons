package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_340 {
    private final Production79_340 production = new Production79_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}