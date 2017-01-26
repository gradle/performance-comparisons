package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_75 {
    private final Production4_75 production = new Production4_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}