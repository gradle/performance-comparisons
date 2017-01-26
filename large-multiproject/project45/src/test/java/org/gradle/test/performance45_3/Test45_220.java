package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_220 {
    private final Production45_220 production = new Production45_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}