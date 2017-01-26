package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_5 {
    private final Production18_5 production = new Production18_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}