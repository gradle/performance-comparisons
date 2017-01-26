package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_73 {
    private final Production4_73 production = new Production4_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}