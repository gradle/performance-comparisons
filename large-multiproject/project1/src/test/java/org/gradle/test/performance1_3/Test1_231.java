package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_231 {
    private final Production1_231 production = new Production1_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}