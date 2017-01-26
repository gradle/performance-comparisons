package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_450 {
    private final Production7_450 production = new Production7_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}