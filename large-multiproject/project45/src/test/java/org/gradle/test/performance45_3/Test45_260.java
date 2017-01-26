package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_260 {
    private final Production45_260 production = new Production45_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}