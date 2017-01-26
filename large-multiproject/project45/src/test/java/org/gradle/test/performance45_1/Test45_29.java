package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_29 {
    private final Production45_29 production = new Production45_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}