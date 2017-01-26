package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_215 {
    private final Production30_215 production = new Production30_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}