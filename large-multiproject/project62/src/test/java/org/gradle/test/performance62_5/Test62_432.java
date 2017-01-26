package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_432 {
    private final Production62_432 production = new Production62_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}