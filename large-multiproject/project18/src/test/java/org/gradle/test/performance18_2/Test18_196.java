package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_196 {
    private final Production18_196 production = new Production18_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}