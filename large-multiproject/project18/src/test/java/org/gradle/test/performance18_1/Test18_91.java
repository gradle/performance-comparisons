package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_91 {
    private final Production18_91 production = new Production18_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}