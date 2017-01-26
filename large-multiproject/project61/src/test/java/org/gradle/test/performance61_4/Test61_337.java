package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_337 {
    private final Production61_337 production = new Production61_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}