package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_96 {
    private final Production73_96 production = new Production73_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}