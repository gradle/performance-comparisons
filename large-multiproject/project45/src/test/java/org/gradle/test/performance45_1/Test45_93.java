package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_93 {
    private final Production45_93 production = new Production45_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}