package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_253 {
    private final Production1_253 production = new Production1_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}