package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_98 {
    private final Production61_98 production = new Production61_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}