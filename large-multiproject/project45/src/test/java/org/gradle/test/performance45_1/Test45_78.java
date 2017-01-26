package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_78 {
    private final Production45_78 production = new Production45_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}