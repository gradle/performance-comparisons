package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_495 {
    private final Production50_495 production = new Production50_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}