package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_334 {
    private final Production33_334 production = new Production33_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}