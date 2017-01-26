package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_154 {
    private final Production1_154 production = new Production1_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}