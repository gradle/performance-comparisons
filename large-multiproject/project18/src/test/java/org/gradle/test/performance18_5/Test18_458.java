package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_458 {
    private final Production18_458 production = new Production18_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}