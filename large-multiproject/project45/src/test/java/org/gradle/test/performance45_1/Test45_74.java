package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_74 {
    private final Production45_74 production = new Production45_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}