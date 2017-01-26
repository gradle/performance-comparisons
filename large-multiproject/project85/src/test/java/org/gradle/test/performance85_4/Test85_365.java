package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_365 {
    private final Production85_365 production = new Production85_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}