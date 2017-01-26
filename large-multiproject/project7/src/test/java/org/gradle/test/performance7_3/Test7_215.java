package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_215 {
    private final Production7_215 production = new Production7_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}