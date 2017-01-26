package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_445 {
    private final Production75_445 production = new Production75_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}