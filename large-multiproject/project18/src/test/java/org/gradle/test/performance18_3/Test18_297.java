package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_297 {
    private final Production18_297 production = new Production18_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}