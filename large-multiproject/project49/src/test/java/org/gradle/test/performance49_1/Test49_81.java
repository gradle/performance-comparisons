package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_81 {
    private final Production49_81 production = new Production49_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}