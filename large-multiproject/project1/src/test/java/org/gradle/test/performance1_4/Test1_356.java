package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_356 {
    private final Production1_356 production = new Production1_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}