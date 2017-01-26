package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_12 {
    private final Production49_12 production = new Production49_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}