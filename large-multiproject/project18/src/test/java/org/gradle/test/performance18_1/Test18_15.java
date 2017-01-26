package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_15 {
    private final Production18_15 production = new Production18_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}