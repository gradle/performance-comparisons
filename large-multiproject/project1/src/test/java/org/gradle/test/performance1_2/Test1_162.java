package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_162 {
    private final Production1_162 production = new Production1_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}