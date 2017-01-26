package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_226 {
    private final Production45_226 production = new Production45_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}