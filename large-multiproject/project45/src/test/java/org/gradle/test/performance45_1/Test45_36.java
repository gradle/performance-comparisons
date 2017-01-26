package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_36 {
    private final Production45_36 production = new Production45_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}