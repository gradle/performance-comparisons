package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_47 {
    private final Production45_47 production = new Production45_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}