package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_325 {
    private final Production48_325 production = new Production48_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}