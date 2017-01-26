package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_7 {
    private final Production49_7 production = new Production49_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}