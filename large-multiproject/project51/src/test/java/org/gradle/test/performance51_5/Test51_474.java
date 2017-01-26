package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_474 {
    private final Production51_474 production = new Production51_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}