package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_156 {
    private final Production30_156 production = new Production30_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}