package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_73 {
    private final Production61_73 production = new Production61_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}