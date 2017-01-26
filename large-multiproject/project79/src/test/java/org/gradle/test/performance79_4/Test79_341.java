package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_341 {
    private final Production79_341 production = new Production79_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}