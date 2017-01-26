package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_231 {
    private final Production51_231 production = new Production51_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}