package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_268 {
    private final Production73_268 production = new Production73_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}