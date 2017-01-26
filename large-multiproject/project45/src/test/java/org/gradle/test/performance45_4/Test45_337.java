package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_337 {
    private final Production45_337 production = new Production45_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}