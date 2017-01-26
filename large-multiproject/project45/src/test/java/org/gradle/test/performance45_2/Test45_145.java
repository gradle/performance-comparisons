package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_145 {
    private final Production45_145 production = new Production45_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}