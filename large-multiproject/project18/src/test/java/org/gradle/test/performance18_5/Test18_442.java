package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_442 {
    private final Production18_442 production = new Production18_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}