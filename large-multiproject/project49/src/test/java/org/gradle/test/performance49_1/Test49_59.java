package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_59 {
    private final Production49_59 production = new Production49_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}