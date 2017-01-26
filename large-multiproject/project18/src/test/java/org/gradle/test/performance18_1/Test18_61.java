package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_61 {
    private final Production18_61 production = new Production18_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}