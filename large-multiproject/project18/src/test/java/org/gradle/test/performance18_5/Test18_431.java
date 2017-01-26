package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_431 {
    private final Production18_431 production = new Production18_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}