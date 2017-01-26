package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_46 {
    private final Production18_46 production = new Production18_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}