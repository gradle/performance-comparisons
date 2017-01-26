package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_67 {
    private final Production1_67 production = new Production1_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}