package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_293 {
    private final Production61_293 production = new Production61_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}