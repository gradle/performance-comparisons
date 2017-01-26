package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_4 {
    private final Production45_4 production = new Production45_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}