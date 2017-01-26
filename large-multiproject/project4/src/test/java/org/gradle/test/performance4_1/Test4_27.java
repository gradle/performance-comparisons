package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_27 {
    private final Production4_27 production = new Production4_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}