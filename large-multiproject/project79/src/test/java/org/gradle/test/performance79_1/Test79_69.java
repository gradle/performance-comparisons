package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_69 {
    private final Production79_69 production = new Production79_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}