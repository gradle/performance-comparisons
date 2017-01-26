package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_138 {
    private final Production49_138 production = new Production49_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}