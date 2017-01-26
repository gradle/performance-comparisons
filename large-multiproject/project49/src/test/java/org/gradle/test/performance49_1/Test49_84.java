package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_84 {
    private final Production49_84 production = new Production49_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}