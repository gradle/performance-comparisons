package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_500 {
    private final Production1_500 production = new Production1_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}