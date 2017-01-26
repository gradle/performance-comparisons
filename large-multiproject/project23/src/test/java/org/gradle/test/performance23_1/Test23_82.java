package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_82 {
    private final Production23_82 production = new Production23_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}