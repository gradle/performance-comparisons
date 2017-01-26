package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_305 {
    private final Production7_305 production = new Production7_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}