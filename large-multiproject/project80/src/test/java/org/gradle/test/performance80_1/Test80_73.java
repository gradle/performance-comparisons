package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_73 {
    private final Production80_73 production = new Production80_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}