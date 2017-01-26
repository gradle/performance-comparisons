package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_15 {
    private final Production1_15 production = new Production1_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}