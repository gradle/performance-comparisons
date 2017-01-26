package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_367 {
    private final Production7_367 production = new Production7_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}