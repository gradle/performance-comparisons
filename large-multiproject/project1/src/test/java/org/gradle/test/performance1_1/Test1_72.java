package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_72 {
    private final Production1_72 production = new Production1_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}