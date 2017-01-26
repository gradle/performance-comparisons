package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_59 {
    private final Production18_59 production = new Production18_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}