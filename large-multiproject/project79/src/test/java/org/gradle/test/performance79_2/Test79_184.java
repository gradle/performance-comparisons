package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_184 {
    private final Production79_184 production = new Production79_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}