package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_246 {
    private final Production73_246 production = new Production73_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}