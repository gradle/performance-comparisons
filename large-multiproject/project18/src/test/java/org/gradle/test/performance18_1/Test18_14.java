package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_14 {
    private final Production18_14 production = new Production18_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}