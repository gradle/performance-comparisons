package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_403 {
    private final Production7_403 production = new Production7_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}