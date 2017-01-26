package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_458 {
    private final Production45_458 production = new Production45_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}