package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_8 {
    private final Production45_8 production = new Production45_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}