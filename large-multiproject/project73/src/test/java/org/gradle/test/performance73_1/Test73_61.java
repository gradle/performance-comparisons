package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_61 {
    private final Production73_61 production = new Production73_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}