package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_497 {
    private final Production18_497 production = new Production18_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}