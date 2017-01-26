package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_362 {
    private final Production73_362 production = new Production73_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}