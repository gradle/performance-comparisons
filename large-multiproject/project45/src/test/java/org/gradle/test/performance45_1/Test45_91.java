package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_91 {
    private final Production45_91 production = new Production45_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}