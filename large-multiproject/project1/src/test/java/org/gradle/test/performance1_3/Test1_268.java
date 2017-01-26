package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_268 {
    private final Production1_268 production = new Production1_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}