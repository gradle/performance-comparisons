package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_464 {
    private final Production1_464 production = new Production1_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}