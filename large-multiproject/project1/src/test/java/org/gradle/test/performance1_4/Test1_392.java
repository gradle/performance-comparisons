package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_392 {
    private final Production1_392 production = new Production1_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}