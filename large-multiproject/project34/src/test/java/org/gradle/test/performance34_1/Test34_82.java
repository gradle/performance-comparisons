package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_82 {
    private final Production34_82 production = new Production34_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}