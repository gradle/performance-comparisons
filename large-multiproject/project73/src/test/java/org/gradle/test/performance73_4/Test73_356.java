package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_356 {
    private final Production73_356 production = new Production73_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}