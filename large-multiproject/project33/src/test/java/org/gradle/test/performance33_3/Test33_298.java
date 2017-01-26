package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_298 {
    private final Production33_298 production = new Production33_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}