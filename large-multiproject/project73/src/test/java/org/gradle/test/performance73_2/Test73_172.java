package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_172 {
    private final Production73_172 production = new Production73_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}