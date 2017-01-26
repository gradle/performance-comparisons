package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_38 {
    private final Production73_38 production = new Production73_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}