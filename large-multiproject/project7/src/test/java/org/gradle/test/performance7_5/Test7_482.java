package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_482 {
    private final Production7_482 production = new Production7_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}