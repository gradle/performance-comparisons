package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_469 {
    private final Production18_469 production = new Production18_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}