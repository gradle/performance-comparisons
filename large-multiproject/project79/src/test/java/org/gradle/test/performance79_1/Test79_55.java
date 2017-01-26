package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_55 {
    private final Production79_55 production = new Production79_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}