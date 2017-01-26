package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_97 {
    private final Production1_97 production = new Production1_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}