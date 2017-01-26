package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_500 {
    private final Production4_500 production = new Production4_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}