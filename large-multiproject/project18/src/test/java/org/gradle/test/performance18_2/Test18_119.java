package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_119 {
    private final Production18_119 production = new Production18_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}