package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_87 {
    private final Production49_87 production = new Production49_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}