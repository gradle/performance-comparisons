package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_78 {
    private final Production18_78 production = new Production18_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}