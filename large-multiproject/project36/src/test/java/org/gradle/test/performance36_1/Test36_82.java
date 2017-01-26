package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_82 {
    private final Production36_82 production = new Production36_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}