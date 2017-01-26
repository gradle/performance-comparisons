package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_134 {
    private final Production1_134 production = new Production1_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}