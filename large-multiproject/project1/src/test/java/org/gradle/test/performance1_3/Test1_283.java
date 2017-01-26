package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_283 {
    private final Production1_283 production = new Production1_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}