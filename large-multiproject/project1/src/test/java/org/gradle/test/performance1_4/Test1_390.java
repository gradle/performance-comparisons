package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_390 {
    private final Production1_390 production = new Production1_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}