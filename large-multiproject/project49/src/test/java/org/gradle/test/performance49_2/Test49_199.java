package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_199 {
    private final Production49_199 production = new Production49_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}