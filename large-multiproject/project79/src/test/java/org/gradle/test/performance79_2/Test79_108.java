package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_108 {
    private final Production79_108 production = new Production79_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}