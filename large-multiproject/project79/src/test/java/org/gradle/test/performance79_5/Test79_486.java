package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_486 {
    private final Production79_486 production = new Production79_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}