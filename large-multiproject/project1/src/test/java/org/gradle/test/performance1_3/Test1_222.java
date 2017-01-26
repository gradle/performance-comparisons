package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_222 {
    private final Production1_222 production = new Production1_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}