package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_127 {
    private final Production30_127 production = new Production30_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}