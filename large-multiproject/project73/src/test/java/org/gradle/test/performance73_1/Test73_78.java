package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_78 {
    private final Production73_78 production = new Production73_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}