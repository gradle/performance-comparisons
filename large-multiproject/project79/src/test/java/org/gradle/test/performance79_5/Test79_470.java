package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_470 {
    private final Production79_470 production = new Production79_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}