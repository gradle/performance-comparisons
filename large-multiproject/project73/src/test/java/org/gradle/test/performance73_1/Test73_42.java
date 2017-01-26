package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_42 {
    private final Production73_42 production = new Production73_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}