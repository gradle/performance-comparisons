package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_183 {
    private final Production61_183 production = new Production61_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}