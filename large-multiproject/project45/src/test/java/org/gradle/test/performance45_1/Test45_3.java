package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_3 {
    private final Production45_3 production = new Production45_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}