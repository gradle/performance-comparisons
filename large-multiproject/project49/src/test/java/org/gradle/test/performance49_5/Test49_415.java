package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_415 {
    private final Production49_415 production = new Production49_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}