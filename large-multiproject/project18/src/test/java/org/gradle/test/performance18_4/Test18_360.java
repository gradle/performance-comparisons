package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_360 {
    private final Production18_360 production = new Production18_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}