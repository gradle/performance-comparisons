package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_41 {
    private final Production18_41 production = new Production18_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}