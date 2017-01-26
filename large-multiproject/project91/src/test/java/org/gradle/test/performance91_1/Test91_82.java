package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_82 {
    private final Production91_82 production = new Production91_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}