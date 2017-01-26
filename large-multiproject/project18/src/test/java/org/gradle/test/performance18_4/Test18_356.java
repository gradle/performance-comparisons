package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_356 {
    private final Production18_356 production = new Production18_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}