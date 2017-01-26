package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_27 {
    private final Production49_27 production = new Production49_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}