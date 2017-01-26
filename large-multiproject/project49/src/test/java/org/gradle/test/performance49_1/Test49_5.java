package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_5 {
    private final Production49_5 production = new Production49_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}