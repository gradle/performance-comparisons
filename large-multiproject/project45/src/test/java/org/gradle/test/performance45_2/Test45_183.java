package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_183 {
    private final Production45_183 production = new Production45_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}