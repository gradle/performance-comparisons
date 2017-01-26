package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_364 {
    private final Production30_364 production = new Production30_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}