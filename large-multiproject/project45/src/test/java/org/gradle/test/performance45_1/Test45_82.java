package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_82 {
    private final Production45_82 production = new Production45_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}