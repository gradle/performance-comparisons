package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_98 {
    private final Production73_98 production = new Production73_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}