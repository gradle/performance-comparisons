package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_58 {
    private final Production1_58 production = new Production1_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}