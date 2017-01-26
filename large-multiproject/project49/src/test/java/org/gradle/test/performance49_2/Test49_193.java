package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_193 {
    private final Production49_193 production = new Production49_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}