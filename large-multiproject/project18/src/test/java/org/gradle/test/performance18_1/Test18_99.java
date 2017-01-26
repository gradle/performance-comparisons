package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_99 {
    private final Production18_99 production = new Production18_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}