package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_73 {
    private final Production92_73 production = new Production92_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}