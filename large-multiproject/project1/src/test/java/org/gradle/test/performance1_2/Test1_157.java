package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_157 {
    private final Production1_157 production = new Production1_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}