package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_6 {
    private final Production49_6 production = new Production49_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}