package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_239 {
    private final Production18_239 production = new Production18_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}