package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_137 {
    private final Production1_137 production = new Production1_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}