package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_75 {
    private final Production73_75 production = new Production73_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}