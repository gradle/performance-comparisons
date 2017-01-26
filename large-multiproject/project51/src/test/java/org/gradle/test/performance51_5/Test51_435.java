package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_435 {
    private final Production51_435 production = new Production51_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}