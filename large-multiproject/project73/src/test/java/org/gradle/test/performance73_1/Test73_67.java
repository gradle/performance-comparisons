package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_67 {
    private final Production73_67 production = new Production73_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}