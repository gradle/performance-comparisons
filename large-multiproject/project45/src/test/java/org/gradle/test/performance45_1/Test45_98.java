package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_98 {
    private final Production45_98 production = new Production45_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}