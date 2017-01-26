package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_442 {
    private final Production45_442 production = new Production45_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}