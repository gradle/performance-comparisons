package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_435 {
    private final Production18_435 production = new Production18_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}