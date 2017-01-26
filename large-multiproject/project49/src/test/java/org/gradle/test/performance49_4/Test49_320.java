package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_320 {
    private final Production49_320 production = new Production49_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}