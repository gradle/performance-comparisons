package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_235 {
    private final Production79_235 production = new Production79_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}