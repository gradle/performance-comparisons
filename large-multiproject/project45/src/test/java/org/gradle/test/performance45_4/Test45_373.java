package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_373 {
    private final Production45_373 production = new Production45_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}