package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_300 {
    private final Production18_300 production = new Production18_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}