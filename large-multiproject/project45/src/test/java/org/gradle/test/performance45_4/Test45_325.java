package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_325 {
    private final Production45_325 production = new Production45_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}