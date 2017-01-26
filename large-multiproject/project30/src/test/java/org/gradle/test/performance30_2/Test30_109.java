package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_109 {
    private final Production30_109 production = new Production30_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}