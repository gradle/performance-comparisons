package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_86 {
    private final Production79_86 production = new Production79_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}