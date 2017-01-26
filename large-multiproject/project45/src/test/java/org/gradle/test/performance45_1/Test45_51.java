package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_51 {
    private final Production45_51 production = new Production45_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}