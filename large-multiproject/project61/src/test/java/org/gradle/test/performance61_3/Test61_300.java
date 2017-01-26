package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_300 {
    private final Production61_300 production = new Production61_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}