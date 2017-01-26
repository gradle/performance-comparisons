package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_134 {
    private final Production18_134 production = new Production18_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}