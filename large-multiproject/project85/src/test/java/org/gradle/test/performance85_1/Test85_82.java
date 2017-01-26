package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_82 {
    private final Production85_82 production = new Production85_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}