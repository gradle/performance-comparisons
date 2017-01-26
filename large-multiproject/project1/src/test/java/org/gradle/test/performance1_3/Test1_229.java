package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_229 {
    private final Production1_229 production = new Production1_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}