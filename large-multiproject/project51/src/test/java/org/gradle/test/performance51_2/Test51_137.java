package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_137 {
    private final Production51_137 production = new Production51_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}