package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_199 {
    private final Production73_199 production = new Production73_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}