package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_450 {
    private final Production1_450 production = new Production1_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}