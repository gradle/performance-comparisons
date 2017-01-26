package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_482 {
    private final Production49_482 production = new Production49_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}