package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_196 {
    private final Production45_196 production = new Production45_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}