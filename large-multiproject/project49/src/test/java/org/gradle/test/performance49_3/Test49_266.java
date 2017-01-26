package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_266 {
    private final Production49_266 production = new Production49_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}