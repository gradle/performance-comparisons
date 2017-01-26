package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_4 {
    private final Production49_4 production = new Production49_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}