package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_162 {
    private final Production49_162 production = new Production49_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}