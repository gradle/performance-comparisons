package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_154 {
    private final Production18_154 production = new Production18_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}