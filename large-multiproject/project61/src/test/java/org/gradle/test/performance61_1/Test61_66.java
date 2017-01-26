package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_66 {
    private final Production61_66 production = new Production61_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}