package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_362 {
    private final Production30_362 production = new Production30_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}