package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_474 {
    private final Production1_474 production = new Production1_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}