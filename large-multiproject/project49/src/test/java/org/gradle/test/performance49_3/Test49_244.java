package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_244 {
    private final Production49_244 production = new Production49_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}