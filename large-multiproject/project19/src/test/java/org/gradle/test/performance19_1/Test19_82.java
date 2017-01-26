package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_82 {
    private final Production19_82 production = new Production19_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}