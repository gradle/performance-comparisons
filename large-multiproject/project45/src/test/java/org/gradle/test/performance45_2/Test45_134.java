package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_134 {
    private final Production45_134 production = new Production45_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}