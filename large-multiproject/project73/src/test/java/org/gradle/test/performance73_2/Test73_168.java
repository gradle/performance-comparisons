package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_168 {
    private final Production73_168 production = new Production73_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}