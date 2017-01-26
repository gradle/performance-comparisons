package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_168 {
    private final Production45_168 production = new Production45_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}