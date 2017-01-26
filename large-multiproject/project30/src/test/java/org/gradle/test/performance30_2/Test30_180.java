package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_180 {
    private final Production30_180 production = new Production30_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}