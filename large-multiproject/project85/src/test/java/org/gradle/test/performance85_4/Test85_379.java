package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_379 {
    private final Production85_379 production = new Production85_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}