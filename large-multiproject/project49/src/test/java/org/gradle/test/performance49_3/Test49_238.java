package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_238 {
    private final Production49_238 production = new Production49_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}