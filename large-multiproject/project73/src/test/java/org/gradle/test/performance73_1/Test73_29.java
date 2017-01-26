package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_29 {
    private final Production73_29 production = new Production73_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}