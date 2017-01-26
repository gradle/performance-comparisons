package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_371 {
    private final Production1_371 production = new Production1_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}