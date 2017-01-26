package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_95 {
    private final Production49_95 production = new Production49_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}