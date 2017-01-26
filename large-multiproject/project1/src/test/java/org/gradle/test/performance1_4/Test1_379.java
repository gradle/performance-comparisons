package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_379 {
    private final Production1_379 production = new Production1_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}