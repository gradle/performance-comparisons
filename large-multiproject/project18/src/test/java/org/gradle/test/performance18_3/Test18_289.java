package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_289 {
    private final Production18_289 production = new Production18_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}