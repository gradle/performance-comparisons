package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_143 {
    private final Production49_143 production = new Production49_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}