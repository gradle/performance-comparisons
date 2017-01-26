package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_44 {
    private final Production61_44 production = new Production61_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}