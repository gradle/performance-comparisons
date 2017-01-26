package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_268 {
    private final Production18_268 production = new Production18_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}