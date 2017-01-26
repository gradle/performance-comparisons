package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_76 {
    private final Production1_76 production = new Production1_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}