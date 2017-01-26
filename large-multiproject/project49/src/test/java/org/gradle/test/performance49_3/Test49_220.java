package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_220 {
    private final Production49_220 production = new Production49_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}