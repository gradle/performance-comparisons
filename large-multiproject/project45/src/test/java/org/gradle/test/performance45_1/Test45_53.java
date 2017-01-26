package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_53 {
    private final Production45_53 production = new Production45_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}