package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_196 {
    private final Production73_196 production = new Production73_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}