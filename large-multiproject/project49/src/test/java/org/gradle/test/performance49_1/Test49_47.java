package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_47 {
    private final Production49_47 production = new Production49_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}