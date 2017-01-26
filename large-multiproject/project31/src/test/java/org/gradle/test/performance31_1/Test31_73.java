package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_73 {
    private final Production31_73 production = new Production31_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}