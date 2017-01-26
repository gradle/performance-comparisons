package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_331 {
    private final Production75_331 production = new Production75_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}