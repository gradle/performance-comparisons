package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_492 {
    private final Production49_492 production = new Production49_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}