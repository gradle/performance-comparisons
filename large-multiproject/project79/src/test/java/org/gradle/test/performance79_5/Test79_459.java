package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_459 {
    private final Production79_459 production = new Production79_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}