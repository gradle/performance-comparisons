package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_447 {
    private final Production49_447 production = new Production49_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}