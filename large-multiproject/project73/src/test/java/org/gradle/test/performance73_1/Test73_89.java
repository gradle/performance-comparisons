package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_89 {
    private final Production73_89 production = new Production73_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}