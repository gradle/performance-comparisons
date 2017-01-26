package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_220 {
    private final Production1_220 production = new Production1_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}