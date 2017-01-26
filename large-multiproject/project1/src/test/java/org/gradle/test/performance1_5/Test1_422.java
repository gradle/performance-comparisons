package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_422 {
    private final Production1_422 production = new Production1_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}