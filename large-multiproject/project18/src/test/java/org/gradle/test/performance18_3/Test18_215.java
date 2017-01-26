package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_215 {
    private final Production18_215 production = new Production18_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}