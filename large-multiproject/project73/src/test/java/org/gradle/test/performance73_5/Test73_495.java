package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_495 {
    private final Production73_495 production = new Production73_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}