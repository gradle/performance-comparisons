package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_401 {
    private final Production7_401 production = new Production7_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}