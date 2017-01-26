package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_48 {
    private final Production18_48 production = new Production18_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}