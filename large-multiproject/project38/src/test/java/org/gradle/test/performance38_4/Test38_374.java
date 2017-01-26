package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_374 {
    private final Production38_374 production = new Production38_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}