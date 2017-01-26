package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_134 {
    private final Production73_134 production = new Production73_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}