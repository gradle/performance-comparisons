package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_222 {
    private final Production18_222 production = new Production18_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}