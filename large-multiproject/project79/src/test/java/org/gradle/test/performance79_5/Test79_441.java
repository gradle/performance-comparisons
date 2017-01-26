package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_441 {
    private final Production79_441 production = new Production79_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}