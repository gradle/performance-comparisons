package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_468 {
    private final Production49_468 production = new Production49_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}