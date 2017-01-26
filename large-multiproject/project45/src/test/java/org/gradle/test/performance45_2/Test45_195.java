package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_195 {
    private final Production45_195 production = new Production45_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}