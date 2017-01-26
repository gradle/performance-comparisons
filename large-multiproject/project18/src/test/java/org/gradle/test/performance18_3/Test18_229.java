package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_229 {
    private final Production18_229 production = new Production18_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}