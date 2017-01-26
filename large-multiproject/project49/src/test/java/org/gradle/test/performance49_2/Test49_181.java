package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_181 {
    private final Production49_181 production = new Production49_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}