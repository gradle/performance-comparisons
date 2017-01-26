package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_239 {
    private final Production1_239 production = new Production1_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}