package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_83 {
    private final Production30_83 production = new Production30_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}