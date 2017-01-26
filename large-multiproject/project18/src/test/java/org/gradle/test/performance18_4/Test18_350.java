package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_350 {
    private final Production18_350 production = new Production18_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}