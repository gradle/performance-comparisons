package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_350 {
    private final Production45_350 production = new Production45_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}