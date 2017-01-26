package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_367 {
    private final Production1_367 production = new Production1_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}