package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_361 {
    private final Production18_361 production = new Production18_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}