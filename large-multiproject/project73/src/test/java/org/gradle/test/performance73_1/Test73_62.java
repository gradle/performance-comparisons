package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_62 {
    private final Production73_62 production = new Production73_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}