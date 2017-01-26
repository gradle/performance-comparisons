package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_293 {
    private final Production1_293 production = new Production1_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}