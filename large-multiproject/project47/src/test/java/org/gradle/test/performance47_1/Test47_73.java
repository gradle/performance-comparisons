package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_73 {
    private final Production47_73 production = new Production47_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}