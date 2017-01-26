package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_300 {
    private final Production45_300 production = new Production45_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}