package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_61 {
    private final Production51_61 production = new Production51_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}