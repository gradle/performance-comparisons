package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_99 {
    private final Production1_99 production = new Production1_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}