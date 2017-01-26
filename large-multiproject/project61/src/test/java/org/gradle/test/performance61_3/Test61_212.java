package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_212 {
    private final Production61_212 production = new Production61_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}