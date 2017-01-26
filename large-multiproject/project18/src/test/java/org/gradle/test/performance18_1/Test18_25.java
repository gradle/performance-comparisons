package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_25 {
    private final Production18_25 production = new Production18_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}