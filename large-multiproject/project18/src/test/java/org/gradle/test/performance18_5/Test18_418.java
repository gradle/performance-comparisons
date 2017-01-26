package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_418 {
    private final Production18_418 production = new Production18_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}