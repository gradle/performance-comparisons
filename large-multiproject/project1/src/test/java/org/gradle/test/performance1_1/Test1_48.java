package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_48 {
    private final Production1_48 production = new Production1_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}