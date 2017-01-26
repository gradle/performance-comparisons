package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_171 {
    private final Production1_171 production = new Production1_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}