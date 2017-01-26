package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_367 {
    private final Production18_367 production = new Production18_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}