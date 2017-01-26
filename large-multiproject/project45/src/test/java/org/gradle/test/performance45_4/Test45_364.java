package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_364 {
    private final Production45_364 production = new Production45_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}