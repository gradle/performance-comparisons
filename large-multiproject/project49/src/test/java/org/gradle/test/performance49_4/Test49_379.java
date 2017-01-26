package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_379 {
    private final Production49_379 production = new Production49_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}