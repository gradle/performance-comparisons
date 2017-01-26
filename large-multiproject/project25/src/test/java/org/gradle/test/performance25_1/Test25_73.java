package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_73 {
    private final Production25_73 production = new Production25_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}