package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_466 {
    private final Production1_466 production = new Production1_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}