package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_157 {
    private final Production50_157 production = new Production50_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}