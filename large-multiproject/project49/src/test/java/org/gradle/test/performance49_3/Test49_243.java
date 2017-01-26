package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_243 {
    private final Production49_243 production = new Production49_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}