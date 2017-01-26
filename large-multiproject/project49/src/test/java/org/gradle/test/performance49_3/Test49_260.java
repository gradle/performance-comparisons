package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_260 {
    private final Production49_260 production = new Production49_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}