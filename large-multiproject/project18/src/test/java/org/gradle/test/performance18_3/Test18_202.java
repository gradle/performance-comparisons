package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_202 {
    private final Production18_202 production = new Production18_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}