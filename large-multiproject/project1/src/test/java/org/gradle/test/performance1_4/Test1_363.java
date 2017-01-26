package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_363 {
    private final Production1_363 production = new Production1_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}