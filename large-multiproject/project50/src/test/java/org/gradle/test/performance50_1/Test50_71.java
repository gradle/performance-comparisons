package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_71 {
    private final Production50_71 production = new Production50_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}