package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_303 {
    private final Production1_303 production = new Production1_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}