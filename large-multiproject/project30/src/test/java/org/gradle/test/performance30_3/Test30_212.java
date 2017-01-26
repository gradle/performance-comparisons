package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_212 {
    private final Production30_212 production = new Production30_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}