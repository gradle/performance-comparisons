package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_7 {
    private final Production45_7 production = new Production45_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}