package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_137 {
    private final Production49_137 production = new Production49_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}