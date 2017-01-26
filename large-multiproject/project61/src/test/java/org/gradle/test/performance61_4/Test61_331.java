package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_331 {
    private final Production61_331 production = new Production61_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}