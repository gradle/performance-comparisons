package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_246 {
    private final Production18_246 production = new Production18_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}