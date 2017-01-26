package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_154 {
    private final Production49_154 production = new Production49_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}