package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_427 {
    private final Production61_427 production = new Production61_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}