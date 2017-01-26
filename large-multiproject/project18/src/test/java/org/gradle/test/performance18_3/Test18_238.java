package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_238 {
    private final Production18_238 production = new Production18_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}