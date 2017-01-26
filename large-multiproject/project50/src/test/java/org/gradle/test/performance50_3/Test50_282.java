package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_282 {
    private final Production50_282 production = new Production50_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}