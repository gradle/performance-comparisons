package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_293 {
    private final Production73_293 production = new Production73_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}