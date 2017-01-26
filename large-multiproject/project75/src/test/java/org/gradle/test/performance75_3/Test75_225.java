package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_225 {
    private final Production75_225 production = new Production75_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}