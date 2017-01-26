package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_412 {
    private final Production79_412 production = new Production79_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}