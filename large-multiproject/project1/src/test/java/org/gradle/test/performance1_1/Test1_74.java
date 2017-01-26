package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_74 {
    private final Production1_74 production = new Production1_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}