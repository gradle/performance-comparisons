package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_304 {
    private final Production1_304 production = new Production1_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}