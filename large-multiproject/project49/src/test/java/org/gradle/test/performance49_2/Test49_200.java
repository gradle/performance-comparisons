package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_200 {
    private final Production49_200 production = new Production49_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}