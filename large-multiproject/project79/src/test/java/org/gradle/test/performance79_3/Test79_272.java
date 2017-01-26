package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_272 {
    private final Production79_272 production = new Production79_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}