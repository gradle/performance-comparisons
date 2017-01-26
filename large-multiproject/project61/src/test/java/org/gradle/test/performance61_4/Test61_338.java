package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_338 {
    private final Production61_338 production = new Production61_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}