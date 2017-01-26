package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_437 {
    private final Production50_437 production = new Production50_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}