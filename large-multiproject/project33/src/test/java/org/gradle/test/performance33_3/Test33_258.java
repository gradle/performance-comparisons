package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_258 {
    private final Production33_258 production = new Production33_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}