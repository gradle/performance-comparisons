package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_389 {
    private final Production33_389 production = new Production33_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}