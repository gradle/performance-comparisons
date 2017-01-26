package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_89 {
    private final Production50_89 production = new Production50_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}