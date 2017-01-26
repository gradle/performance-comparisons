package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_382 {
    private final Production18_382 production = new Production18_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}