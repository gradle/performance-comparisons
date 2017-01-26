package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_14 {
    private final Production45_14 production = new Production45_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}