package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_444 {
    private final Production73_444 production = new Production73_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}