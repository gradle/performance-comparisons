package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_307 {
    private final Production1_307 production = new Production1_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}