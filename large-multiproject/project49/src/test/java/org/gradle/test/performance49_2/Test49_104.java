package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_104 {
    private final Production49_104 production = new Production49_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}