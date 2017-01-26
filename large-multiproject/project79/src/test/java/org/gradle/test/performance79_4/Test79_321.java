package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_321 {
    private final Production79_321 production = new Production79_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}