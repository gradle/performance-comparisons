package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_2 {
    private final Production45_2 production = new Production45_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}