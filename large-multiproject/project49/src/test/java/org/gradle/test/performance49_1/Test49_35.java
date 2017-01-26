package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_35 {
    private final Production49_35 production = new Production49_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}