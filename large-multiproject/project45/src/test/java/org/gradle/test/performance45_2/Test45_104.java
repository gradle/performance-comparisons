package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_104 {
    private final Production45_104 production = new Production45_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}