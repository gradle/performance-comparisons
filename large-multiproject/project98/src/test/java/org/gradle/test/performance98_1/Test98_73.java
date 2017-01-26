package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_73 {
    private final Production98_73 production = new Production98_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}