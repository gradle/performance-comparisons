package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_332 {
    private final Production79_332 production = new Production79_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}