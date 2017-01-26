package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_235 {
    private final Production30_235 production = new Production30_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}