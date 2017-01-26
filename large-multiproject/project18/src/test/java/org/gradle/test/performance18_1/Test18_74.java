package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_74 {
    private final Production18_74 production = new Production18_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}