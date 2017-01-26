package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_73 {
    private final Production50_73 production = new Production50_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}