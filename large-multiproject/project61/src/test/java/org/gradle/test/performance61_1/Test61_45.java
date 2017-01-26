package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_45 {
    private final Production61_45 production = new Production61_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}