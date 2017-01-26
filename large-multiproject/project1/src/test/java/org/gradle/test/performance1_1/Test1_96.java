package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_96 {
    private final Production1_96 production = new Production1_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}