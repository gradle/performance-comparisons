package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_294 {
    private final Production61_294 production = new Production61_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}