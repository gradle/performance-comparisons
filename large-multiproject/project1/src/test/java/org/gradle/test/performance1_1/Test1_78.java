package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_78 {
    private final Production1_78 production = new Production1_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}