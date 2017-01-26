package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_72 {
    private final Production73_72 production = new Production73_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}