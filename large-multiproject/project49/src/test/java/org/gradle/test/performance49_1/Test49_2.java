package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_2 {
    private final Production49_2 production = new Production49_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}