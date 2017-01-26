package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_445 {
    private final Production61_445 production = new Production61_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}