package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_303 {
    private final Production49_303 production = new Production49_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}