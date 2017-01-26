package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_201 {
    private final Production33_201 production = new Production33_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}