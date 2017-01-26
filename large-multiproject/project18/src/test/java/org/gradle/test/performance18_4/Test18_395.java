package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_395 {
    private final Production18_395 production = new Production18_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}