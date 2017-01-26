package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_93 {
    private final Production61_93 production = new Production61_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}