package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_67 {
    private final Production18_67 production = new Production18_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}