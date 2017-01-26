package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_66 {
    private final Production18_66 production = new Production18_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}