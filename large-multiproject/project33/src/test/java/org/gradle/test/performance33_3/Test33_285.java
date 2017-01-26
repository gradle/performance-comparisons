package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_285 {
    private final Production33_285 production = new Production33_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}