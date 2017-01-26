package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_49 {
    private final Production50_49 production = new Production50_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}