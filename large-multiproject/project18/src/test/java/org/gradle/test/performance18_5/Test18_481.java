package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_481 {
    private final Production18_481 production = new Production18_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}