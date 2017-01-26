package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_422 {
    private final Production18_422 production = new Production18_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}