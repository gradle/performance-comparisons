package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_213 {
    private final Production49_213 production = new Production49_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}