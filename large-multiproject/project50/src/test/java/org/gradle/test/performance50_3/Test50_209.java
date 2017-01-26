package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_209 {
    private final Production50_209 production = new Production50_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}