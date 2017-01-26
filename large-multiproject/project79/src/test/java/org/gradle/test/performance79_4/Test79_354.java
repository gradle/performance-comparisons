package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_354 {
    private final Production79_354 production = new Production79_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}