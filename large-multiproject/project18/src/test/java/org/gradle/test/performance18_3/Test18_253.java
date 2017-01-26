package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_253 {
    private final Production18_253 production = new Production18_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}