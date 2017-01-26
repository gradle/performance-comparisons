package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_166 {
    private final Production73_166 production = new Production73_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}