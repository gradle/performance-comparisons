package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_138 {
    private final Production18_138 production = new Production18_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}