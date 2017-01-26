package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_235 {
    private final Production51_235 production = new Production51_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}