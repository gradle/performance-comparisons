package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_165 {
    private final Production79_165 production = new Production79_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}