package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_88 {
    private final Production73_88 production = new Production73_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}