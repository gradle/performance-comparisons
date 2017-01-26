package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_405 {
    private final Production18_405 production = new Production18_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}