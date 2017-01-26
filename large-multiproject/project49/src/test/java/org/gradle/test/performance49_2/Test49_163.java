package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_163 {
    private final Production49_163 production = new Production49_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}