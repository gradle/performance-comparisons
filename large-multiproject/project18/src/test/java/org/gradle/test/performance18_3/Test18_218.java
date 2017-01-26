package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_218 {
    private final Production18_218 production = new Production18_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}