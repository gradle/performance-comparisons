package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_235 {
    private final Production7_235 production = new Production7_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}