package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_300 {
    private final Production49_300 production = new Production49_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}