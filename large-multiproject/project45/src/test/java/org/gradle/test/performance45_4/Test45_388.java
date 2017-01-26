package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_388 {
    private final Production45_388 production = new Production45_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}