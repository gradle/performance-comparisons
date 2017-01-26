package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_328 {
    private final Production33_328 production = new Production33_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}