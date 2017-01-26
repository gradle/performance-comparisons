package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_94 {
    private final Production79_94 production = new Production79_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}