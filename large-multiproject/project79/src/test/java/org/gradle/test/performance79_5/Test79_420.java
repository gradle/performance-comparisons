package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_420 {
    private final Production79_420 production = new Production79_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}