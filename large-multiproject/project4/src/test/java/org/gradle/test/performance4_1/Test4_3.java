package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_3 {
    private final Production4_3 production = new Production4_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}