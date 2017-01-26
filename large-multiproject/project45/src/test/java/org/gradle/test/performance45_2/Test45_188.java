package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_188 {
    private final Production45_188 production = new Production45_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}