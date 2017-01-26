package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_161 {
    private final Production49_161 production = new Production49_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}