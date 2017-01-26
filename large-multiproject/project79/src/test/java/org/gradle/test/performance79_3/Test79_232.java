package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_232 {
    private final Production79_232 production = new Production79_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}