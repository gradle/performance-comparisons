package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_243 {
    private final Production45_243 production = new Production45_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}