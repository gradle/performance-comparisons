package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_26 {
    private final Production1_26 production = new Production1_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}