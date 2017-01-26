package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_32 {
    private final Production79_32 production = new Production79_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}