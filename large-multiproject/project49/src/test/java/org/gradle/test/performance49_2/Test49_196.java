package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_196 {
    private final Production49_196 production = new Production49_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}