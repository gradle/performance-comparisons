package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_215 {
    private final Production5_215 production = new Production5_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}