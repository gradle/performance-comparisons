package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_81 {
    private final Production45_81 production = new Production45_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}