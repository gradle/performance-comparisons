package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_228 {
    private final Production18_228 production = new Production18_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}