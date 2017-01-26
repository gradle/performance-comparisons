package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_415 {
    private final Production18_415 production = new Production18_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}