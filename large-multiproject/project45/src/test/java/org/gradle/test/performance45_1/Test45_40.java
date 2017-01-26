package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_40 {
    private final Production45_40 production = new Production45_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}