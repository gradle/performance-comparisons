package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_450 {
    private final Production30_450 production = new Production30_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}