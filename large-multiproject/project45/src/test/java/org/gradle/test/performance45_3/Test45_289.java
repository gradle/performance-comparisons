package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_289 {
    private final Production45_289 production = new Production45_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}