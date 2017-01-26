package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_135 {
    private final Production1_135 production = new Production1_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}