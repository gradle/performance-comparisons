package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_147 {
    private final Production1_147 production = new Production1_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}