package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_98 {
    private final Production18_98 production = new Production18_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}