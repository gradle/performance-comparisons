package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_53 {
    private final Production49_53 production = new Production49_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}