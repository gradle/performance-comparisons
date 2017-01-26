package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_374 {
    private final Production33_374 production = new Production33_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}