package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_60 {
    private final Production30_60 production = new Production30_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}