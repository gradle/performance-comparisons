package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_228 {
    private final Production45_228 production = new Production45_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}