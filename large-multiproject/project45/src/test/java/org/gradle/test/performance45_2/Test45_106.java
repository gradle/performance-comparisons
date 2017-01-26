package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_106 {
    private final Production45_106 production = new Production45_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}