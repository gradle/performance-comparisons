package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_172 {
    private final Production50_172 production = new Production50_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}