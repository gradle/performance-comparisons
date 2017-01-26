package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_288 {
    private final Production61_288 production = new Production61_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}