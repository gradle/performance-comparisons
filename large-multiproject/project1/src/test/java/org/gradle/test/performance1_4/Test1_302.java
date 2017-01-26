package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_302 {
    private final Production1_302 production = new Production1_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}