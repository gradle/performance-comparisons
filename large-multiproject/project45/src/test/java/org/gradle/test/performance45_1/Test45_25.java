package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_25 {
    private final Production45_25 production = new Production45_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}