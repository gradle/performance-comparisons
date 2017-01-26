package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_284 {
    private final Production79_284 production = new Production79_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}