package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_145 {
    private final Production49_145 production = new Production49_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}