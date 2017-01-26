package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_1 {
    private final Production49_1 production = new Production49_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}