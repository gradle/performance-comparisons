package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_282 {
    private final Production61_282 production = new Production61_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}