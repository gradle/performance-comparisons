package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_83 {
    private final Production79_83 production = new Production79_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}