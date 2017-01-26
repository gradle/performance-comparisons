package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_244 {
    private final Production51_244 production = new Production51_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}