package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_231 {
    private final Production45_231 production = new Production45_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}