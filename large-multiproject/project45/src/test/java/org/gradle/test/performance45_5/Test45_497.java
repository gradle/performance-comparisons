package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_497 {
    private final Production45_497 production = new Production45_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}