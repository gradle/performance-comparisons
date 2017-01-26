package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_212 {
    private final Production7_212 production = new Production7_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}