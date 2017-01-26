package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_396 {
    private final Production1_396 production = new Production1_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}