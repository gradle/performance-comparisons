package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_73 {
    private final Production58_73 production = new Production58_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}