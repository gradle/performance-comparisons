package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_93 {
    private final Production73_93 production = new Production73_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}