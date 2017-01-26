package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_73 {
    private final Production7_73 production = new Production7_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}