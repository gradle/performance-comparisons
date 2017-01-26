package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_198 {
    private final Production79_198 production = new Production79_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}