package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_46 {
    private final Production30_46 production = new Production30_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}