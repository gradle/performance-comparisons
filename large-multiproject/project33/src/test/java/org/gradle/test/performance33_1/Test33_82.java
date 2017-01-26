package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_82 {
    private final Production33_82 production = new Production33_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}