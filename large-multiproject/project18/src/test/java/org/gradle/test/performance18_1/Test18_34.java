package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_34 {
    private final Production18_34 production = new Production18_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}