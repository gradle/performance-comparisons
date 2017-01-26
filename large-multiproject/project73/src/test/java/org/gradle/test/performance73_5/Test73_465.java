package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_465 {
    private final Production73_465 production = new Production73_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}