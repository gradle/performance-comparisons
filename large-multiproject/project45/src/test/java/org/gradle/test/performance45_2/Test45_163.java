package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_163 {
    private final Production45_163 production = new Production45_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}