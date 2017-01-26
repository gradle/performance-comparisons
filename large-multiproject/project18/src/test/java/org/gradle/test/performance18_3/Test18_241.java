package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_241 {
    private final Production18_241 production = new Production18_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}