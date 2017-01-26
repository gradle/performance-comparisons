package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_364 {
    private final Production49_364 production = new Production49_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}