package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_427 {
    private final Production3_427 production = new Production3_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}