package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_26 {
    private final Production18_26 production = new Production18_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}