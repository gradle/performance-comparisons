package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_197 {
    private final Production79_197 production = new Production79_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}