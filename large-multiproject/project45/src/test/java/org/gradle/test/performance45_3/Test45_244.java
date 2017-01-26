package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_244 {
    private final Production45_244 production = new Production45_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}