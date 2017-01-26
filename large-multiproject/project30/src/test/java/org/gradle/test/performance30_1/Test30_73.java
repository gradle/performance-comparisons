package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_73 {
    private final Production30_73 production = new Production30_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}