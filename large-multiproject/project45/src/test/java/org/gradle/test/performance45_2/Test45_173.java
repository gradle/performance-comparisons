package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_173 {
    private final Production45_173 production = new Production45_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}