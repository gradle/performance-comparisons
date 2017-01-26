package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_253 {
    private final Production45_253 production = new Production45_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}