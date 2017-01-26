package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_150 {
    private final Production49_150 production = new Production49_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}