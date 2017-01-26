package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_126 {
    private final Production18_126 production = new Production18_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}