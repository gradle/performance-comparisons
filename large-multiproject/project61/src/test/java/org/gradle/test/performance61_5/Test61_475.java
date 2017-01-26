package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_475 {
    private final Production61_475 production = new Production61_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}