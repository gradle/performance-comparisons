package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_407 {
    private final Production79_407 production = new Production79_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}