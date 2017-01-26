package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_202 {
    private final Production61_202 production = new Production61_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}