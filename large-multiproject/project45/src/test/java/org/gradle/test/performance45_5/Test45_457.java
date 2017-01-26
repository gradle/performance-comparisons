package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_457 {
    private final Production45_457 production = new Production45_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}