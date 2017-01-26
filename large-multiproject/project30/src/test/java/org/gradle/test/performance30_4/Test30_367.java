package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_367 {
    private final Production30_367 production = new Production30_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}