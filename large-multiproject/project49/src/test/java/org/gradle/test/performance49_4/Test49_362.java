package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_362 {
    private final Production49_362 production = new Production49_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}