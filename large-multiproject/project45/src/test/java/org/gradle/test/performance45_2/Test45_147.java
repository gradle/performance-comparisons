package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_147 {
    private final Production45_147 production = new Production45_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}