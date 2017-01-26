package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_401 {
    private final Production30_401 production = new Production30_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}