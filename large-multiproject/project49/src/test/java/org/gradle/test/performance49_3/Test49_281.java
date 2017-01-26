package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_281 {
    private final Production49_281 production = new Production49_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}