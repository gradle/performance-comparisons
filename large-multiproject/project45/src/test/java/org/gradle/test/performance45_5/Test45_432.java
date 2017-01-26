package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_432 {
    private final Production45_432 production = new Production45_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}