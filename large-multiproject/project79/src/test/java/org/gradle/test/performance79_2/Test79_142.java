package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_142 {
    private final Production79_142 production = new Production79_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}