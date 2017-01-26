package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_203 {
    private final Production1_203 production = new Production1_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}