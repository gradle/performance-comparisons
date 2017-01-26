package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_64 {
    private final Production79_64 production = new Production79_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}