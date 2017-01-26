package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_38 {
    private final Production18_38 production = new Production18_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}