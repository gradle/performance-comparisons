package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_96 {
    private final Production45_96 production = new Production45_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}