package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_365 {
    private final Production49_365 production = new Production49_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}