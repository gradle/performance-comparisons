package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_215 {
    private final Production73_215 production = new Production73_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}