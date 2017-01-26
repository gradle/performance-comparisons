package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_82 {
    private final Production72_82 production = new Production72_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}