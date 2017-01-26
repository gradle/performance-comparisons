package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_282 {
    private final Production75_282 production = new Production75_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}