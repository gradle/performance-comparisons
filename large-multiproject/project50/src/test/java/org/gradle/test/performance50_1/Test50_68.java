package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_68 {
    private final Production50_68 production = new Production50_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}