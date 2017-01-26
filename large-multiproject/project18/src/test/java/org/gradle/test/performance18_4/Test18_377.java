package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_377 {
    private final Production18_377 production = new Production18_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}