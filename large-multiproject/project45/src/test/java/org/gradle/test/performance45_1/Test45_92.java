package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_92 {
    private final Production45_92 production = new Production45_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}