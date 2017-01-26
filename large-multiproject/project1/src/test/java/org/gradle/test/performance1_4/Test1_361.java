package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_361 {
    private final Production1_361 production = new Production1_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}