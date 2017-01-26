package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_69 {
    private final Production30_69 production = new Production30_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}