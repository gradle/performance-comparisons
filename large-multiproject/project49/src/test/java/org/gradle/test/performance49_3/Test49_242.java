package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_242 {
    private final Production49_242 production = new Production49_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}