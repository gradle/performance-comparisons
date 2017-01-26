package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_33 {
    private final Production1_33 production = new Production1_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}