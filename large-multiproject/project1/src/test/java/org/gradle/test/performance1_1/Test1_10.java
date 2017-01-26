package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_10 {
    private final Production1_10 production = new Production1_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}