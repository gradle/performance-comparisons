package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_498 {
    private final Production61_498 production = new Production61_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}