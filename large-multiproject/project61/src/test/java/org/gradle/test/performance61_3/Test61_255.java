package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_255 {
    private final Production61_255 production = new Production61_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}