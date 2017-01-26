package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_109 {
    private final Production49_109 production = new Production49_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}