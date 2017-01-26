package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_131 {
    private final Production49_131 production = new Production49_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}