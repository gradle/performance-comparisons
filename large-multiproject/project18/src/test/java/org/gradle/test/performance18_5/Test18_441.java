package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_441 {
    private final Production18_441 production = new Production18_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}