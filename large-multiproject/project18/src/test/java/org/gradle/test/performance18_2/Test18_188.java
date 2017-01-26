package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_188 {
    private final Production18_188 production = new Production18_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}