package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_82 {
    private final Production73_82 production = new Production73_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}