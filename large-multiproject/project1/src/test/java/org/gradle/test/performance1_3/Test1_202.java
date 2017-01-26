package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_202 {
    private final Production1_202 production = new Production1_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}