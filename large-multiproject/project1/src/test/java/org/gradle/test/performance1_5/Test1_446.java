package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_446 {
    private final Production1_446 production = new Production1_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}