package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_27 {
    private final Production1_27 production = new Production1_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}