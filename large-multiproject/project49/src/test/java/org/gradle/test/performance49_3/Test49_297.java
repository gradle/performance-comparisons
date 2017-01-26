package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_297 {
    private final Production49_297 production = new Production49_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}