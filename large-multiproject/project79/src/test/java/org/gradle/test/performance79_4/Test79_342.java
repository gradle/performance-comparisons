package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_342 {
    private final Production79_342 production = new Production79_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}