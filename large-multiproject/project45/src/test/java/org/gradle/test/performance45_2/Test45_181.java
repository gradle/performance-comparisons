package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_181 {
    private final Production45_181 production = new Production45_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}