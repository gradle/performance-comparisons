package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_97 {
    private final Production73_97 production = new Production73_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}