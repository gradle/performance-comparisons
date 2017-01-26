package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_107 {
    private final Production73_107 production = new Production73_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}