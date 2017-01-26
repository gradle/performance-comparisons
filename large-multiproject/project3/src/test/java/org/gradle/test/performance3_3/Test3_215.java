package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_215 {
    private final Production3_215 production = new Production3_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}