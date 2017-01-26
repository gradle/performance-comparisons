package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_137 {
    private final Production18_137 production = new Production18_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}